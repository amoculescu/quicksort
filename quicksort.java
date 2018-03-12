import java.lang.Math.*;
import java.util.*;

public class quicksort{
  private ArrayList<Double> unsorted;
  private ArrayList<Double> sorted;

  public quicksort(){
    this.unsorted = new ArrayList<Double>();
    this.sorted = new ArrayList<Double>();
  }

  public ArrayList<Double> getList(String selector){
      return selector.equals("unsorted") ? this.unsorted : this.sorted;
  }

  public void setSorted(ArrayList<Double> al){
    this.sorted = al;
  }
  public void fill(double number){
    for (int i = 0; i < Math.floor(number); i++){
      this.unsorted.add(Math.floor(Math.random()* (Math.pow(2, 31) - 1)));
    }
  }

  public void emptyLists(){
    this.unsorted.clear();
    this.sorted.clear();
  }

  public ArrayList<Double> sort(ArrayList<Double> toSort){
    if(toSort.isEmpty()){
      return toSort;
    }
    else if(toSort.size() == 1){
      return toSort;
    }
    else{
      ArrayList<Double> smaller = new ArrayList<Double>();
      ArrayList<Double> bigger = new ArrayList<Double>();
      double pivot = toSort.get(0);
      for (int i = 1; i < toSort.size(); i++){
        if(toSort.get(i) > pivot){
          bigger.add(toSort.get(i));
        } else{
          smaller.add(toSort.get(i));
        }
      }
      ArrayList<Double> test = sort(smaller);
      test.add(pivot);
      test.addAll(sort(bigger));
      return test;
    }
  }
}
