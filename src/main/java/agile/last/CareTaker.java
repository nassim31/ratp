package agile.last;

import java.util.ArrayList;
import java.util.List;


public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        if(mementoList.size()>index && index>0){
        return mementoList.get(index);
        }else return mementoList.get(0);
    }

}