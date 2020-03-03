package com.app.semantics3api;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
     RecyclerView productslist;
    private boolean isLoading;
    private int previousTotel = 0;
    private int item_count = 10;
    int offset = 0;
    ArrayList<ResultsItem> resultsItems = new ArrayList<>();
    Adapter madapter;
    String inputValue;
    private LinearLayoutManager linearLayoutManager;
    private int lastVisibleItem, totalItemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          productslist = (RecyclerView) findViewById(R.id.productslist);
       /* RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        productslist.setLayoutManager(mLayoutManager);*/
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        productslist.setLayoutManager(linearLayoutManager);


        AppCompatEditText edtText = (AppCompatEditText) findViewById(R.id.edtText);

        edtText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE) {
                    inputValue = textView.getText().toString();
                    offset = 0;
                    isLoading = false;
                    item_count = 10;
                    previousTotel= 0;
                    searchItemAsync(inputValue,offset, item_count, new ItemSearchListener() {
                        @Override
                        public void onSearchComplete(JSONObject object) {
                            try {
                                resultsItems = new ArrayList<>();
                                JSONArray results = object.getJSONArray("results");
                                for (int i = 0; i < results.length(); i++) {
                                    JSONObject item = results.getJSONObject(i);
                                    ResultsItem resultsItem = new ResultsItem();
                                    resultsItem.setName(item.getString("name"));
                                    resultsItem.setPrice(item.getString("price"));

                                  //a  resultsItem.setDescription(item.getString("description"));

                                    ArrayList<String> images = new ArrayList<>();
                                    JSONArray imageslist = item.optJSONArray("images");
                                    String image = imageslist.optString(0);
                                    images.add(image);
                                    resultsItem.setImages(images);

                                    ArrayList<SitedetailsItem> sitedetailsItems = new ArrayList<>();
                                    JSONArray sitedetails = item.optJSONArray("sitedetails");
                                    for (int j = 0; j < sitedetails.length(); j++) {
                                        SitedetailsItem sitedetailsItem = new SitedetailsItem();
                                        JSONObject sites = sitedetails.getJSONObject(j);
                                        sitedetailsItem.setName(sites.getString("name"));
                                        sitedetailsItems.add(sitedetailsItem);

                                    }
                                    resultsItem.setSitedetails(sitedetailsItems);
                                    resultsItems.add(resultsItem);
                                }
                                 madapter = new Adapter(resultsItems,getApplicationContext(), sendData);
                                productslist.setAdapter(madapter);
                                Log.e("res", "" + results);
                            } catch (Exception er) {
                                er.printStackTrace();
                            }
                        }
                    });
                    return true;
                }
                return false;
            }
        });
        setPaginatio();
    }

    public static void searchItemAsync(String content,int offset, int max_items, ItemSearchListener itemSearchListener) {
        new ItemSearchAsync(itemSearchListener).execute(content, String.valueOf(offset),String.valueOf(max_items));
    }

    private void setPaginatio() {
        productslist.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                totalItemCount = linearLayoutManager.getItemCount();
                lastVisibleItem = linearLayoutManager.findFirstVisibleItemPosition();
                Log.e("isLoading", isLoading + "");
                Log.e("totalItemCount", totalItemCount + "");
                Log.e("previousTotel", previousTotel + "");
                if (dy > 0) {
                    if (isLoading) {
                        if (totalItemCount > previousTotel) {
                            isLoading = false;
                            previousTotel = totalItemCount;
                        }
                    }
                    if (!isLoading && totalItemCount <= (lastVisibleItem + item_count)) {
                        offset++;
                        Log.e("offset", offset + "");
                        callPaginationApi();
                        isLoading = true;
                    }
                }
            }
        });
    }

    private void callPaginationApi(){
        try {
            searchItemAsync(inputValue, offset, item_count, new ItemSearchListener() {
                @Override
                public void onSearchComplete(JSONObject object) {
                    try {
                        JSONArray results = object.getJSONArray("results");
                        for (int i = 0; i < results.length(); i++) {
                            JSONObject item = results.getJSONObject(i);
                            ResultsItem resultsItem = new ResultsItem();
                            resultsItem.setName(item.getString("name"));
                            resultsItem.setPrice(item.getString("price"));

                            //a  resultsItem.setDescription(item.getString("description"));

                            ArrayList<String> images = new ArrayList<>();
                            JSONArray imageslist = item.optJSONArray("images");
                            String image = imageslist.optString(0);
                            images.add(image);
                            resultsItem.setImages(images);

                            ArrayList<SitedetailsItem> sitedetailsItems = new ArrayList<>();
                            JSONArray sitedetails = item.optJSONArray("sitedetails");
                            for (int j = 0; j < sitedetails.length(); j++) {
                                SitedetailsItem sitedetailsItem = new SitedetailsItem();
                                JSONObject sites = sitedetails.getJSONObject(j);
                                sitedetailsItem.setName(sites.getString("name"));
                                sitedetailsItems.add(sitedetailsItem);


                            }
                            resultsItem.setSitedetails(sitedetailsItems);
                            resultsItems.add(resultsItem);
                        }
                        madapter.notifyDataSetChanged();

                        Log.e("res", "" + results);
                    } catch (Exception er) {
                        er.printStackTrace();
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    Adapter.sendData sendData = new Adapter.sendData() {
       @Override
       public void sendDetais(ArrayList<SitedetailsItem> resultsItem) {
           Bundle args = new Bundle();
           args.putSerializable("tar_name", resultsItem);

           ProductDetailsDialog dialog = new ProductDetailsDialog();
           dialog.setArguments(args);
           dialog.show(getSupportFragmentManager(), ProductDetailsDialog.class.getSimpleName());
           dialog.setCancelable(true);
       }
   };
}
