package edu.pdx.ece558f18.gmid2.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity
{

    public static final String EXTRA_CRIME_ID =
            "edu.pdx.ece558f18.gmid2.criminalintent.crime_id";

    public static Intent newIntent(Context packageCopntext, UUID crimeID)
    {
        Intent intent = new Intent(packageCopntext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeID);
        return intent;
    }

    @Override
    protected Fragment createFragment()
    {
        return new CrimeFragment();
    }
}
