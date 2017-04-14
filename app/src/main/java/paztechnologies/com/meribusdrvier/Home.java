package paztechnologies.com.meribusdrvier;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/13/2017.
 */

public class Home extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        init();

        tabLayout.addTab(tabLayout.newTab().setText("HOME").setIcon(R.mipmap.home) );
        tabLayout.addTab(tabLayout.newTab().setText("EARNINGS").setIcon(R.mipmap.earn) );
        tabLayout.addTab(tabLayout.newTab().setText("RATING").setIcon(R.mipmap.rating) );
        tabLayout.addTab(tabLayout.newTab().setText("ACCOUNT").setIcon(R.mipmap.account) );
        viewPager.setAdapter(new Tab_adapter(getSupportFragmentManager()));
       // tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(this);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setOffscreenPageLimit(4);
    }

    private void init(){
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        tabLayout.getTabAt(tab.getPosition()).select();
        tabLayout.getTabAt(0).setIcon(R.mipmap.select_home);

        if (tab.getPosition() == 0) {

            tabLayout.getTabAt(0).setIcon(R.mipmap.select_home);
            tabLayout.getTabAt(1).setIcon(R.mipmap.earn);
            tabLayout.getTabAt(2).setIcon(R.mipmap.rating);
            tabLayout.getTabAt(3).setIcon(R.mipmap.account);
        }
        if (tab.getPosition() == 1) {

            tabLayout.getTabAt(0).setIcon(R.mipmap.home);
            tabLayout.getTabAt(1).setIcon(R.mipmap.select_earn);
            tabLayout.getTabAt(2).setIcon(R.mipmap.rating);
            tabLayout.getTabAt(3).setIcon(R.mipmap.account);
        }
        if(tab.getPosition()==2){

            tabLayout.getTabAt(0).setIcon(R.mipmap.home);
            tabLayout.getTabAt(1).setIcon(R.mipmap.earn);
            tabLayout.getTabAt(2).setIcon(R.mipmap.select_rating);
            tabLayout.getTabAt(3).setIcon(R.mipmap.account);

        }
        if(tab.getPosition()==3){
            tabLayout.getTabAt(3).setIcon(R.mipmap.select_account);
            tabLayout.getTabAt(0).setIcon(R.mipmap.home);
            tabLayout.getTabAt(1).setIcon(R.mipmap.earn);
            tabLayout.getTabAt(2).setIcon(R.mipmap.rating);

        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


    class Tab_adapter extends FragmentPagerAdapter{

        public Tab_adapter(FragmentManager fm) {
            super(fm);

        }



        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Home_Fragment home_fragment= new Home_Fragment();
                    return home_fragment;

                case 1:
                    Earning earning= new Earning();
                    return earning;

                case 2:
                    Rating rating= new Rating();
                    return rating;
                case 3:
                    Setting setting= new Setting();
                    return setting;

                default:
                    Home_Fragment home_fragment1= new Home_Fragment();
                    return home_fragment1;
            }


        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
