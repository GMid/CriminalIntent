package edu.pdx.ece558f18.gmid2.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab
{
    public static CrimeLab sCrimeLab;       // the one instance of this singleton

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context)
    {
        if (sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context)
    {
        mCrimes = new ArrayList<>();
        // temporarily hard code the crimes
        for (int i = 0; i < 100; i++)
        {
            Crime crime = new Crime();
            crime.setTitle("Crime " + i);
            crime.setSolved((i % 2) == 0);  // every other one is solved
            mCrimes.add(crime);
        }
    }

    public List getCrimes()
    {
        return mCrimes;
    }

    public Crime getCrime(UUID id)
    {
        for (Crime crime : mCrimes)
        {
            if (crime.getId().equals(id))
            {
                return crime;
            }
        }
        return null;
    }
}
