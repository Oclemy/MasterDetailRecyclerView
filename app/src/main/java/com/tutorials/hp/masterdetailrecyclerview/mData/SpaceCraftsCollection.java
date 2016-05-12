package com.tutorials.hp.masterdetailrecyclerview.mData;

import com.tutorials.hp.masterdetailrecyclerview.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class SpaceCraftsCollection {

    public static ArrayList<SpaceCraft> getSpaceCrafts()
    {
        ArrayList<SpaceCraft> spaceCrafts=new ArrayList<>();
        SpaceCraft spaceCraft=null;

        //ADD DATA TO COLLECTION
        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Pioneer");
        spaceCraft.setImage(R.drawable.pioneer);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Enterprise");
        spaceCraft.setImage(R.drawable.enterprise);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Hubble");
        spaceCraft.setImage(R.drawable.hubble);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Voyager");
        spaceCraft.setImage(R.drawable.voyager);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Spitzer");
        spaceCraft.setImage(R.drawable.spitzer);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Opportunity");
        spaceCraft.setImage(R.drawable.opportunity);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Apollo");
        spaceCraft.setImage(R.drawable.apollo);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Kepler");
        spaceCraft.setImage(R.drawable.kepler);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Columbia");
        spaceCraft.setImage(R.drawable.columbia);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Challenger");
        spaceCraft.setImage(R.drawable.challenger);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Rosetta");
        spaceCraft.setImage(R.drawable.rosetta);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("WMAP");
        spaceCraft.setImage(R.drawable.wmap);
        spaceCrafts.add(spaceCraft);


        //RETURN COLLECTION
        return spaceCrafts;
    }

}
