package com.example.sisillia.bikebank;


import java.util.ArrayList;
import java.util.HashMap;

public class NearestNeighbour {
    public String Hitung(int a, int b, int c, int d, int e){
        ArrayList<DataEntry> data = new ArrayList<>();

        //analisa ya
        data.add(new DataEntry(new double[]{28,1}, "0"));
        data.add(new DataEntry(new double[]{29,1}, "0"));
        data.add(new DataEntry(new double[]{29,1}, "0"));
        data.add(new DataEntry(new double[]{30,0}, "0"));
        data.add(new DataEntry(new double[]{31,0}, "0"));
        data.add(new DataEntry(new double[]{32,0}, "0"));
        data.add(new DataEntry(new double[]{32,1}, "0"));
        data.add(new DataEntry(new double[]{32,1}, "0"));
        data.add(new DataEntry(new double[]{33,1}, "0"));
        data.add(new DataEntry(new double[]{34,0}, "0"));
        data.add(new DataEntry(new double[]{34,1}, "0"));
        data.add(new DataEntry(new double[]{34,1}, "0"));
        data.add(new DataEntry(new double[]{35,0}, "0"));
        data.add(new DataEntry(new double[]{35,0}, "0"));
        data.add(new DataEntry(new double[]{35,1}, "0"));
        data.add(new DataEntry(new double[]{35,1}, "0"));
        data.add(new DataEntry(new double[]{36,1}, "0"));
        data.add(new DataEntry(new double[]{36,1}, "0"));
        data.add(new DataEntry(new double[]{36,1}, "0"));
        data.add(new DataEntry(new double[]{37,0}, "0"));
        data.add(new DataEntry(new double[]{37,0}, "0"));
        data.add(new DataEntry(new double[]{37,0}, "0"));
        data.add(new DataEntry(new double[]{37,1}, "0"));
        data.add(new DataEntry(new double[]{37,1}, "0"));
        data.add(new DataEntry(new double[]{37,1}, "0"));
        data.add(new DataEntry(new double[]{37,1}, "0"));
        data.add(new DataEntry(new double[]{38,0}, "0"));
        data.add(new DataEntry(new double[]{38,1}, "0"));
        data.add(new DataEntry(new double[]{38,1}, "0"));
        data.add(new DataEntry(new double[]{39,0}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{39,1}, "0"));
        data.add(new DataEntry(new double[]{40,1}, "0"));
        data.add(new DataEntry(new double[]{40,1}, "0"));
        data.add(new DataEntry(new double[]{40,1}, "0"));
        data.add(new DataEntry(new double[]{40,1}, "0"));
        data.add(new DataEntry(new double[]{40,1}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{42,0}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,0}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{41,1}, "0"));
        data.add(new DataEntry(new double[]{42,0}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{42,1}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,0}, "0"));
        data.add(new DataEntry(new double[]{43,1}, "0"));
        data.add(new DataEntry(new double[]{44,0}, "0"));
        data.add(new DataEntry(new double[]{44,1}, "0"));
        data.add(new DataEntry(new double[]{44,1}, "0"));
        data.add(new DataEntry(new double[]{44,1}, "0"));
        data.add(new DataEntry(new double[]{45,0}, "0"));
        data.add(new DataEntry(new double[]{45,0}, "0"));
        data.add(new DataEntry(new double[]{45,0}, "0"));
        data.add(new DataEntry(new double[]{45,1}, "0"));
        data.add(new DataEntry(new double[]{45,1}, "0"));
        data.add(new DataEntry(new double[]{45,1}, "0"));
        data.add(new DataEntry(new double[]{45,1}, "0"));
        data.add(new DataEntry(new double[]{46,0}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{46,1}, "0"));
        data.add(new DataEntry(new double[]{47,0}, "0"));
        data.add(new DataEntry(new double[]{47,0}, "0"));
        data.add(new DataEntry(new double[]{47,1}, "0"));
        data.add(new DataEntry(new double[]{47,1}, "0"));
        data.add(new DataEntry(new double[]{47,1}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,0}, "0"));
        data.add(new DataEntry(new double[]{48,1}, "0"));
        data.add(new DataEntry(new double[]{48,1}, "0"));
        data.add(new DataEntry(new double[]{48,1}, "0"));
        data.add(new DataEntry(new double[]{48,1}, "0"));
        data.add(new DataEntry(new double[]{49,0}, "0"));
        data.add(new DataEntry(new double[]{49,0}, "0"));
        data.add(new DataEntry(new double[]{49,0}, "0"));
        data.add(new DataEntry(new double[]{49,0}, "0"));
        data.add(new DataEntry(new double[]{49,1}, "0"));
        data.add(new DataEntry(new double[]{49,1}, "0"));
        data.add(new DataEntry(new double[]{49,1}, "0"));
        data.add(new DataEntry(new double[]{50,0}, "0"));
        data.add(new DataEntry(new double[]{50,0}, "0"));
        data.add(new DataEntry(new double[]{50,1}, "0"));
        data.add(new DataEntry(new double[]{50,1}, "0"));
        data.add(new DataEntry(new double[]{50,1}, "0"));
        data.add(new DataEntry(new double[]{50,1}, "0"));
        data.add(new DataEntry(new double[]{50,1}, "0"));
        data.add(new DataEntry(new double[]{51,0}, "0"));
        data.add(new DataEntry(new double[]{51,0}, "0"));
        data.add(new DataEntry(new double[]{51,0}, "0"));
        data.add(new DataEntry(new double[]{51,0}, "0"));
        data.add(new DataEntry(new double[]{51,1}, "0"));
        data.add(new DataEntry(new double[]{51,1}, "0"));
        data.add(new DataEntry(new double[]{51,1}, "0"));
        data.add(new DataEntry(new double[]{52,0}, "0"));
        data.add(new DataEntry(new double[]{52,0}, "0"));
        data.add(new DataEntry(new double[]{52,0}, "0"));
        data.add(new DataEntry(new double[]{52,0}, "0"));
        data.add(new DataEntry(new double[]{52,1}, "0"));
        data.add(new DataEntry(new double[]{52,1}, "0"));
        data.add(new DataEntry(new double[]{52,1}, "0"));
        data.add(new DataEntry(new double[]{52,1}, "0"));
        data.add(new DataEntry(new double[]{53,0}, "0"));
        data.add(new DataEntry(new double[]{53,0}, "0"));
        data.add(new DataEntry(new double[]{53,0}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{53,1}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,0}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{54,1}, "0"));
        data.add(new DataEntry(new double[]{55,0}, "0"));
        data.add(new DataEntry(new double[]{55,0}, "0"));
        data.add(new DataEntry(new double[]{55,0}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{55,1}, "0"));
        data.add(new DataEntry(new double[]{56,0}, "0"));
        data.add(new DataEntry(new double[]{56,1}, "0"));
        data.add(new DataEntry(new double[]{56,1}, "0"));
        data.add(new DataEntry(new double[]{56,1}, "0"));
        data.add(new DataEntry(new double[]{56,1}, "0"));
        data.add(new DataEntry(new double[]{57,0}, "0"));
        data.add(new DataEntry(new double[]{57,0}, "0"));
        data.add(new DataEntry(new double[]{57,1}, "0"));
        data.add(new DataEntry(new double[]{58,1}, "0"));
        data.add(new DataEntry(new double[]{ 58,1}, "0"));
        data.add(new DataEntry(new double[]{58,1}, "0"));
        data.add(new DataEntry(new double[]{58,1}, "0"));
        data.add(new DataEntry(new double[]{59,0}, "0"));
        data.add(new DataEntry(new double[]{59,1}, "0"));
        data.add(new DataEntry(new double[]{59,1}, "0"));
        data.add(new DataEntry(new double[]{59,1}, "0"));
        data.add(new DataEntry(new double[]{59,1}, "0"));
        data.add(new DataEntry(new double[]{60,1}, "0"));
        data.add(new DataEntry(new double[]{61,0}, "0"));
        data.add(new DataEntry(new double[]{61,1}, "0"));
        data.add(new DataEntry(new double[]{62,0}, "0"));

        //analisa data tidak
        data.add(new DataEntry(new double[]{31,1}, "1"));
        data.add(new DataEntry(new double[]{33,0}, "1"));
        data.add(new DataEntry(new double[]{34,1}, "1"));
        data.add(new DataEntry(new double[]{35,1}, "1"));
        data.add(new DataEntry(new double[]{36,1}, "1"));
        data.add(new DataEntry(new double[]{37,1}, "1"));
        data.add(new DataEntry(new double[]{38,1}, "1"));
        data.add(new DataEntry(new double[]{38,1}, "1"));
        data.add(new DataEntry(new double[]{38,1}, "1"));
        data.add(new DataEntry(new double[]{40,1}, "1"));
        data.add(new DataEntry(new double[]{41,1}, "1"));
        data.add(new DataEntry(new double[]{41,1}, "1"));
        data.add(new DataEntry(new double[]{43,1}, "1"));
        data.add(new DataEntry(new double[]{46,1}, "1"));
        data.add(new DataEntry(new double[]{46,1}, "1"));
        data.add(new DataEntry(new double[]{46,1}, "1"));
        data.add(new DataEntry(new double[]{47,1}, "1"));
        data.add(new DataEntry(new double[]{47,1}, "1"));
        data.add(new DataEntry(new double[]{48,1}, "1"));
        data.add(new DataEntry(new double[]{48,1}, "1"));
        data.add(new DataEntry(new double[]{48,1}, "1"));
        data.add(new DataEntry(new double[]{49,0}, "1"));
        data.add(new DataEntry(new double[]{49,1}, "1"));
        data.add(new DataEntry(new double[]{49,1}, "1"));
        data.add(new DataEntry(new double[]{50,0}, "1"));
        data.add(new DataEntry(new double[]{50,1}, "1"));
        data.add(new DataEntry(new double[]{51,0}, "1"));
        data.add(new DataEntry(new double[]{52,1}, "1"));
        data.add(new DataEntry(new double[]{54,1}, "1"));
        data.add(new DataEntry(new double[]{54,1}, "1"));
        data.add(new DataEntry(new double[]{55,1}, "1"));
        data.add(new DataEntry(new double[]{57,1}, "1"));
        data.add(new DataEntry(new double[]{58,1}, "1"));
        data.add(new DataEntry(new double[]{59,0}, "1"));
        data.add(new DataEntry(new double[]{60,1}, "1"));
        data.add(new DataEntry(new double[]{63,1}, "1"));
        data.add(new DataEntry(new double[]{65,1}, "1"));
        data.add(new DataEntry(new double[]{32,1}, "1"));
        data.add(new DataEntry(new double[]{38,1}, "1"));
        data.add(new DataEntry(new double[]{39,1}, "1"));
        data.add(new DataEntry(new double[]{40,0}, "1"));

        NearestNeighbour nn = new NearestNeighbour(data, 3); //3 neighbours
        return String.valueOf(nn.classify(new DataEntry(new double[]{a, b, c, d, e},"Ignore")));
    }

    public NearestNeighbour(){

    }


    private int k;
    private ArrayList<Object> classes;
    private ArrayList<DataEntry> dataSet;
    /**
     *
     * @param dataSet The set
     * @param k The number of neighbours to use
     */
    public NearestNeighbour(ArrayList<DataEntry> dataSet, int k){
        this.classes = new ArrayList<Object>();
        this.k = k;
        this.dataSet = dataSet;

        //Load different classes
        for(DataEntry entry : dataSet){
            if(!classes.contains(entry.getY())) classes.add(entry.getY());
        }
    }

    private DataEntry[] getNearestNeighbourType(DataEntry x){
        DataEntry[] retur = new DataEntry[this.k];
        double fjernest = Double.MIN_VALUE;
        int index = 0;
        for(DataEntry tse : this.dataSet){
            double distance = distance(x,tse);
            if(retur[retur.length-1] == null){ //Hvis ikke fyldt
                int j = 0;
                while(j < retur.length){
                    if(retur[j] == null){
                        retur[j] = tse; break;
                    }
                    j++;
                }
                if(distance > fjernest){
                    index = j;
                    fjernest = distance;
                }
            }
            else{
                if(distance < fjernest){
                    retur[index] = tse;
                    double f = 0.0;
                    int ind = 0;
                    for(int j = 0; j < retur.length; j++){
                        double dt = distance(retur[j],x);
                        if(dt > f){
                            f = dt;
                            ind = j;
                        }
                    }
                    fjernest = f;
                    index = ind;
                }
            }
        }
        return retur;
    }

    private static double convertDistance(double d){
        return 1.0/d;
    }

    /**
     * Computes Euclidean distance
     * @param a From
     * @param b To
     * @return Distance
     */
    public static double distance(DataEntry a, DataEntry b){
        double distance = 0.0;
        int length = a.getX().length;
        for(int i = 0; i < length; i++){
            double t = a.getX()[i]-b.getX()[i];
            distance = distance+t*t;
        }
        return Math.sqrt(distance);
    }
    /**
     *
     * @param e Entry to be classifies
     * @return The class of the most probable class
     */
    public Object classify(DataEntry e){
        HashMap<Object,Double> classcount = new HashMap<Object,Double>();
        DataEntry[] de = this.getNearestNeighbourType(e);
        for(int i = 0; i < de.length; i++){
            double distance = NearestNeighbour.convertDistance(NearestNeighbour.distance(de[i], e));
            if(!classcount.containsKey(de[i].getY())){
                classcount.put(de[i].getY(), distance);
            }
            else{
                classcount.put(de[i].getY(), classcount.get(de[i].getY())+distance);
            }
        }
        //Find right choice
        Object o = null;
        double max = 0;
        for(Object ob : classcount.keySet()){
            if(classcount.get(ob) > max){
                max = classcount.get(ob);
                o = ob;
            }
        }

        return o;
    }

    public static class DataEntry{
        private double[] x;
        private Object y;

        public DataEntry(double[] x, Object y){
            this.x = x;
            this.y = y;
        }

        public double[] getX(){
            return this.x;
        }

        public Object getY(){
            return this.y;
        }
    }
}


//43,1,1,120,291,0,1,155,0,0,?,?,?,1
//        45,1,4,130,219,0,1,130,1,1,2,?,?,1
//        46,1,4,120,231,0,0,115,1,0,?,?,?,1
//        46,1,4,130,222,0,0,112,0,0,?,?,?,1
//        48,1,4,122,275,1,1,150,1,2,3,?,?,1
//        48,1,4,160,193,0,0,102,1,3,2,?,?,1
//        48,1,4,160,329,0,0,92,1,1.5,2,?,?,1
//        48,1,4,160,355,0,0,99,1,2,2,?,?,1
//        50,1,4,130,233,0,0,121,1,2,2,?,7,1
//        52,1,4,120,182,0,0,150,0,0,?,?,?,1
//        52,1,4,170,?,0,0,126,1,1.5,2,?,?,1
//        53,1,4,120,246,0,0,116,1,0,?,?,?,1
//        54,1,3,120,237,0,0,150,1,1.5,?,?,7,1
//        54,1,4,130,242,0,0,91,1,1,2,?,?,1
//        54,1,4,130,603,1,0,125,1,1,2,?,?,1
//        54,1,4,140,?,0,0,118,1,0,?,?,?,1
//        54,1,4,200,198,0,0,142,1,2,2,?,?,1
//        55,1,4,140,268,0,0,128,1,1.5,2,?,?,1
//        56,1,4,150,213,1,0,125,1,1,2,?,?,1
//        57,1,4,150,255,0,0,92,1,3,2,?,?,1
//        58,1,3,160,211,1,1,92,0,0,?,?,?,1
//        58,1,4,130,263,0,0,140,1,2,2,?,?,1
//        41,1,4,130,172,0,1,130,0,2,2,?,?,1
//        43,1,4,120,175,0,0,120,1,1,2,?,7,1
//        44,1,2,150,288,0,0,150,1,3,2,?,?,1
//        44,1,4,130,290,0,0,100,1,2,2,?,?,1
//        46,1,1,140,272,1,0,175,0,2,2,?,?,1
//        47,0,3,135,248,1,0,170,0,0,?,?,?,1
//        48,0,4,138,214,0,0,108,1,1.5,2,?,?,1
//        49,1,4,130,341,0,0,120,1,1,2,?,?,1
//        49,1,4,140,234,0,0,140,1,1,2,?,?,1
//        51,1,3,135,160,0,0,150,0,2,2,?,?,1
//        52,1,4,112,342,0,1,96,1,1,2,?,?,1
//        52,1,4,130,298,0,0,110,1,1,2,?,?,1
//        52,1,4,140,404,0,0,124,1,2,2,?,?,1
//        52,1,4,160,246,0,1,82,1,4,2,?,?,1
//        53,1,3,145,518,0,0,130,0,0,?,?,?,1
//        53,1,4,180,285,0,1,120,1,1.5,2,?,?,1
//        54,1,4,140,216,0,0,105,0,1.5,2,?,?,1
//        55,1,1,140,295,0,?,136,0,0,?,?,?,1
//        55,1,2,160,292,1,0,143,1,2,2,?,?,1
//        55,1,4,145,248,0,0,96,1,2,2,?,?,1
//        56,0,2,120,279,0,0,150,0,1,2,?,?,1
//        56,1,4,150,230,0,1,124,1,1.5,2,?,?,1
//        56,1,4,170,388,0,1,122,1,2,2,?,?,1
//        58,1,2,136,164,0,1,99,1,2,2,?,?,1
//        59,1,4,130,?,0,0,125,0,0,?,?,?,1
//        59,1,4,140,264,1,2,119,1,0,?,?,?,1
//        65,1,4,170,263,1,0,112,1,2,2,?,?,1
//        66,1,4,140,?,0,0,94,1,1,2,?,?,1
//        41,1,4,120,336,0,0,118,1,3,2,?,?,1
//        43,1,4,140,288,0,0,135,1,2,2,?,?,1
//        44,1,4,135,491,0,0,135,0,0,?,?,?,1
//        47,0,4,120,205,0,0,98,1,2,2,?,6,1
//        47,1,4,160,291,0,1,158,1,3,2,?,?,1
//        49,1,4,128,212,0,0,96,1,0,?,?,?,1
//        49,1,4,150,222,0,0,122,0,2,2,?,?,1
//        50,1,4,140,231,0,1,140,1,5,2,?,?,1
//        50,1,4,140,341,0,1,125,1,2.5,2,?,?,1
//        52,1,4,140,266,0,0,134,1,2,2,?,?,1
//        52,1,4,160,331,0,0,94,1,2.5,?,?,?,1
//        54,0,3,130,294,0,1,100,1,0,2,?,?,1
//        56,1,4,155,342,1,0,150,1,3,2,?,?,1
//        58,0,2,180,393,0,0,110,1,1,2,?,7,1
//        65,1,4,130,275,0,1,115,1,1,2,?,?,1