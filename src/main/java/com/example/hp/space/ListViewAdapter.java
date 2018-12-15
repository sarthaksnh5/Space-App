package com.example.hp.space;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context mContext, List<Model> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }


    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDescription);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        holder.mTitleTv.setText(modelList.get(position).getTilte());
        holder.mDescTv.setText(modelList.get(position).getDesc());

        holder.mIconIv.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modelList.get(position).getTilte().equals("HD 143761 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 143761 c");
                    intent.putExtra("PlanetaryMassJpt", "0.079");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","102.54");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("KOI-1843.03")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "KOI-1843.03");
                    intent.putExtra("PlanetaryMassJpt", "0.0014");
                    intent.putExtra("RadiumJpt","0.054");
                    intent.putExtra("perioddays","0.1768913");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("KOI-1843.01")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "KOI-1843.01");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.114");
                    intent.putExtra("perioddays","4.194525");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("KOI-1843.02")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "KOI-1843.02");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.071");
                    intent.putExtra("perioddays","6.356006");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-9 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-9 b");
                    intent.putExtra("PlanetaryMassJpt", "0.25");
                    intent.putExtra("RadiumJpt","0.84");
                    intent.putExtra("perioddays","19.22418");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-9 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-9 c");
                    intent.putExtra("PlanetaryMassJpt", "0.17");
                    intent.putExtra("RadiumJpt","0.82");
                    intent.putExtra("perioddays","39.03106");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-9 d")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-9 d");
                    intent.putExtra("PlanetaryMassJpt", "0.022");
                    intent.putExtra("RadiumJpt","0.147");
                    intent.putExtra("perioddays","1.592851");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("GJ 160.2 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "GJ 160.2 b");
                    intent.putExtra("PlanetaryMassJpt", "0.0321");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","5.2354");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-566 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-566 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.192");
                    intent.putExtra("perioddays","18.42794624");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("WASP-124 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "WASP-124 b");
                    intent.putExtra("PlanetaryMassJpt", "0.6");
                    intent.putExtra("RadiumJpt","1.24");
                    intent.putExtra("perioddays","3.37265");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 240210 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 240210 b");
                    intent.putExtra("PlanetaryMassJpt", "5.21");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","501.75");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("OGLE-05-390L b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "OGLE-05-390L b");
                    intent.putExtra("PlanetaryMassJpt", "0.017");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","3500");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1343 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1343 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.172");
                    intent.putExtra("perioddays","3.35183158");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1011 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1011 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.256");
                    intent.putExtra("perioddays","5.75322197");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("WASP-82 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "WASP-82 b");
                    intent.putExtra("PlanetaryMassJpt", "1.24");
                    intent.putExtra("RadiumJpt","1.67");
                    intent.putExtra("perioddays","2.705782");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Gliese 1214 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Gliese 1214 b");
                    intent.putExtra("PlanetaryMassJpt", "0.0195");
                    intent.putExtra("RadiumJpt","0.2525");
                    intent.putExtra("perioddays","1.58040417");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-153 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-153 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.2661");
                    intent.putExtra("perioddays","18.870227");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-153 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-153 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.23056");
                    intent.putExtra("perioddays","46.90232");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 4203 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 4203 b");
                    intent.putExtra("PlanetaryMassJpt", "1.82");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","437.05");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 4203 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 4203 c");
                    intent.putExtra("PlanetaryMassJpt", "2.17");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","6700");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 179079 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 179079 b");
                    intent.putExtra("PlanetaryMassJpt", "0.08");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","14.476");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1368 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1368 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.147");
                    intent.putExtra("perioddays","0.67564949");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 187123 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 187123 b");
                    intent.putExtra("PlanetaryMassJpt", "0.5074");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","3.0965886");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 187123 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 187123 c");
                    intent.putExtra("PlanetaryMassJpt", "1.818");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","3324");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1111 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1111 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.178");
                    intent.putExtra("perioddays","8.79617863");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1289 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1289 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.136");
                    intent.putExtra("perioddays","7.99019627");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-431 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-431 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.0682");
                    intent.putExtra("perioddays","6.803");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-431 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-431 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.0596");
                    intent.putExtra("perioddays","8.703");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-431 d")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-431 d");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.099");
                    intent.putExtra("perioddays","11.922");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-131 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-131 b");
                    intent.putExtra("PlanetaryMassJpt", "0.05074");
                    intent.putExtra("RadiumJpt","0.219624");
                    intent.putExtra("perioddays","16.092");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-131 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-131 c");
                    intent.putExtra("PlanetaryMassJpt", "0.025952");
                    intent.putExtra("RadiumJpt","0.076549");
                    intent.putExtra("perioddays","25.5169");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-548 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-548 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","1.07");
                    intent.putExtra("perioddays","4.45419434");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 114729 A b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 114729 A b");
                    intent.putExtra("PlanetaryMassJpt", "0.84");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","1135");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("CoRoT-24 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "CoRoT-24 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.33");
                    intent.putExtra("perioddays","5.1134");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("CoRoT-24 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "CoRoT-24 c");
                    intent.putExtra("PlanetaryMassJpt", "0.088");
                    intent.putExtra("RadiumJpt","0.44");
                    intent.putExtra("perioddays","11.759");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1105 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1105 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.179");
                    intent.putExtra("perioddays","4.42157218");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-211 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-211 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.11756");
                    intent.putExtra("perioddays","6.04045");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-211 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-211 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.11482");
                    intent.putExtra("perioddays","4.138575");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-294 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-294 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.24696");
                    intent.putExtra("perioddays","6.6264");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-294 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-294 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.1613");
                    intent.putExtra("perioddays","3.701212");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 164595 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 164595 b");
                    intent.putExtra("PlanetaryMassJpt", "0.051");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","40");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-257 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-257 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.49301");
                    intent.putExtra("perioddays","6.581484");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-257 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-257 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.23785");
                    intent.putExtra("perioddays","2.382667");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-257 d")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-257 d");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.45109");
                    intent.putExtra("perioddays","24.664551");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-214 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-214 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.19411");
                    intent.putExtra("perioddays","28.7798");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-214 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-214 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.23785");
                    intent.putExtra("perioddays","15.660544");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1112 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1112 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.269");
                    intent.putExtra("perioddays","14.36267939");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-130 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-130 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.25608");
                    intent.putExtra("perioddays","27.508653");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-130 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-130 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.09295");
                    intent.putExtra("perioddays","8.457458");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-130 d")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-130 d");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.14945");
                    intent.putExtra("perioddays","87.517905");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("WASP-108 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "WASP-108 b");
                    intent.putExtra("PlanetaryMassJpt", "0.892");
                    intent.putExtra("RadiumJpt","1.284");
                    intent.putExtra("perioddays","2.6755463");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("K2-34 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "K2-34 b");
                    intent.putExtra("PlanetaryMassJpt", "1.78");
                    intent.putExtra("RadiumJpt","1.35");
                    intent.putExtra("perioddays","2.995607");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-815 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-815 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.367");
                    intent.putExtra("perioddays","8.57503552");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1145 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1145 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.125");
                    intent.putExtra("perioddays","3.97076766");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("38 Vir b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "38 Vir b");
                    intent.putExtra("PlanetaryMassJpt", "4.51");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","825.9");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1575 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1575 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.117");
                    intent.putExtra("perioddays","2.55314213");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1380 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1380 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.128");
                    intent.putExtra("perioddays","10.3108245");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-189 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-189 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.21689");
                    intent.putExtra("perioddays","20.134866");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-189 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-189 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.11027");
                    intent.putExtra("perioddays","10.399931");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-327 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-327 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.10115");
                    intent.putExtra("perioddays","2.549575");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-327 d")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-327 d");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.15766");
                    intent.putExtra("perioddays","13.969457");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-327 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-327 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.09386");
                    intent.putExtra("perioddays","5.212333");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1071 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1071 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.212");
                    intent.putExtra("perioddays","6.1799844");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-101 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-101 b");
                    intent.putExtra("PlanetaryMassJpt", "0.161");
                    intent.putExtra("RadiumJpt","0.515");
                    intent.putExtra("perioddays","3.4876812");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-101 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-101 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.112");
                    intent.putExtra("perioddays","6.02976");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-156 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-156 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.23238");
                    intent.putExtra("perioddays","15.906801");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-156 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-156 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.2096");
                    intent.putExtra("perioddays","4.973456");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HIP 11952 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HIP 11952 b");
                    intent.putExtra("PlanetaryMassJpt", "2.93");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","290");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HIP 11952 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HIP 11952 c");
                    intent.putExtra("PlanetaryMassJpt", "0.78");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","6.95");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("HD 122430 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "HD 122430 b");
                    intent.putExtra("PlanetaryMassJpt", "3.71");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","344.95");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-827 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-827 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.502");
                    intent.putExtra("perioddays","51.92927591");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-344 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-344 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.23785");
                    intent.putExtra("perioddays","21.963945");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-344 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-344 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.26883");
                    intent.putExtra("perioddays","125.596809");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-859 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-859 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.276");
                    intent.putExtra("perioddays","20.38177573");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-227 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-227 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.28342");
                    intent.putExtra("perioddays","9.488015");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-227 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-227 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.27704");
                    intent.putExtra("perioddays","54.418694");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-843 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-843 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.231");
                    intent.putExtra("perioddays","2.05387982");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-404 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-404 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.11574");
                    intent.putExtra("perioddays","11.829851");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-404 c")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-404 c");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.15674");
                    intent.putExtra("perioddays","14.751166");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1483 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1483 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.136");
                    intent.putExtra("perioddays","9.5085156");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Gliese 86 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Gliese 86 b");
                    intent.putExtra("PlanetaryMassJpt", "3.91");
                    intent.putExtra("RadiumJpt","");
                    intent.putExtra("perioddays","15.76491");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1314 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1314 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.456");
                    intent.putExtra("perioddays","5.42474928");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTilte().equals("Kepler-1099 b")){
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Kepler-1099 b");
                    intent.putExtra("PlanetaryMassJpt", "");
                    intent.putExtra("RadiumJpt","0.252");
                    intent.putExtra("perioddays","2.16845259");
                    mContext.startActivity(intent);

                }

            }
        });
        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if(charText.length() == 0){
            modelList.addAll(modelList);
        }
        else{
            for(Model model:arrayList){
                if(model.getTilte().toLowerCase(Locale.getDefault())
                    .contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
