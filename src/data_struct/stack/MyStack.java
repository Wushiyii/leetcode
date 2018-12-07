package data_struct.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<Integer> data;

    MyStack(){
        this.data = new ArrayList<>();
    }

    public void push(int x){
        this.data.add(x);
    }

    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        this.data.remove(this.data.size() - 1);
        return true;
    }

    public int top(){
        return this.data.get(data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

}
