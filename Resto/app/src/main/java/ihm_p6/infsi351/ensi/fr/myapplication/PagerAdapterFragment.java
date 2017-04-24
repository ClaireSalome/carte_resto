package ihm_p6.infsi351.ensi.fr.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by lila on 20/04/17.
 */

public class PagerAdapterFragment extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapterFragment(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                InformationFragment info_tab = new InformationFragment();
                return info_tab;
            case 1:
                ModifierFragment modif_tab = new ModifierFragment();
                return modif_tab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
