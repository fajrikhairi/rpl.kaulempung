package com.sourcey.KauLempung;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.sourcey.KauLempung.Adapter.ItemAdapter;
//import com.sourcey.KauLempung.Model.Item;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//
public class MainActivity extends AppCompatActivity {
//    ArrayList<Item> exampleItems;
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//
//    FirebaseAuth.AuthStateListener listener;
//    private FirebaseAuth mAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mAuth = FirebaseAuth.getInstance();
//        FirebaseUser user = mAuth.getCurrentUser();
////        if (user == null){
////            Intent intent = new Intent(this, LoginActivity.class);
////            startActivity(intent);
////        } else {
////            exampleItems = new ArrayList<>();
////            exampleItems.add(new Item(R.drawable.dandang, "Dandang", "Rp55.000"));
////            exampleItems.add(new Item(R.drawable.gerabah, "Gerabah", "Rp70.000"));
////            exampleItems.add(new Item(R.drawable.guci, "Guci", "Rp95.000"));
////            exampleItems.add(new Item(R.drawable.panci, "Panci", "Rp25.000"));
////            buildRecyclerView();
////        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void buildRecyclerView() {
//        int gridColoumnCount = getResources().getInteger(R.integer.grid_coloumn_count);
//
//        mRecyclerView = findViewById(R.id.rv);
//
//        mAdapter = new ItemAdapter(this,exampleItems);
//
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this,gridColoumnCount));
//        mRecyclerView.setAdapter(mAdapter);
//
//        int swipeDirs;
//        if(gridColoumnCount > 1){
//            swipeDirs = 0;
//        } else {
//            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
//        }
//
//        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper //Method hapus
//                .SimpleCallback(
//                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT |
//                        ItemTouchHelper.DOWN | ItemTouchHelper.UP,
//                swipeDirs) {
//            @Override
//            public boolean onMove(RecyclerView recyclerView,
//                                  RecyclerView.ViewHolder viewHolder,
//                                  RecyclerView.ViewHolder target) {
//                // Get the from and to positions.
//                int from = viewHolder.getAdapterPosition();
//                int to = target.getAdapterPosition();
//
//                // Swap the items and notify the adapter.
//                Collections.swap(exampleItems, from, to);
//                mAdapter.notifyItemMoved(from, to);
//                return true;
//            }
//
//            @Override
//            public void onSwiped(RecyclerView.ViewHolder viewHolder,
//                                 int direction) {
//                // Remove the item from the dataset.
//                exampleItems.remove(viewHolder.getAdapterPosition()); //Menghapus kartu
//                // Notify the adapter.
//                mAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
//            }
//        });
//        helper.attachToRecyclerView(mRecyclerView);
//
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
//            mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
//        } else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
//            mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
//        }
//    }
}
