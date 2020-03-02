package com.app.semantics3api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView productslist = (RecyclerView) findViewById(R.id.productslist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        productslist.setLayoutManager(mLayoutManager);

        AppCompatEditText edtText = (AppCompatEditText) findViewById(R.id.edtText);
        edtText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE) {
                    searchItemAsync(textView.getText().toString(), 10, new ItemSearchListener() {
                        @Override
                        public void onSearchComplete(JSONObject object) {
                            try {
                                ArrayList<ResultsItem> resultsItems = new ArrayList<>();
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

                                    ArrayList<SitedetailsItem> sitedetailsItems = new ArrayList<>();
                                    JSONArray sitedetails = item.optJSONArray("sitedetails");
                                    for (int j = 0; j < sitedetails.length(); j++) {
                                        SitedetailsItem sitedetailsItem = new SitedetailsItem();
                                        JSONObject sites = sitedetails.getJSONObject(j);
                                        sitedetailsItem.setName(sites.getString("name"));
                                        sitedetailsItems.add(sitedetailsItem);
                                    }
                                    resultsItems.add(resultsItem);
                                }
                                Adapter madapter = new Adapter(resultsItems,getApplicationContext());

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
    }

    public static void searchItemAsync(String content, int max_items, ItemSearchListener itemSearchListener) {
        new ItemSearchAsync(itemSearchListener).execute(content, String.valueOf(max_items));
    }
}
