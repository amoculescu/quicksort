import java.lang.Math.*;
import java.util.*;

public class main{
  static quicksort qs = new quicksort();
  static ArrayList<Double> times = new ArrayList<Double>();

  public static void main(String[] args) {
    double startTime = 0;
    double endTime = 0;
    int repeats = 100;
    for(int i = 0; i < repeats; i++){
      qs.fill(Math.pow(10, 7) * 1);
      startTime = System.currentTimeMillis();
      qs.setSorted(qs.sort(qs.getList("unsorted")));
      endTime = System.currentTimeMillis();
      times.add(endTime - startTime);
      qs.emptyLists();
    }
    double avgTime = 0;
    for (int j = 0; j < repeats; j++){
      avgTime += times.get(j);
    }
    avgTime = avgTime / repeats;
    System.out.println("Average time: " + avgTime +
    " milliseconds for the times: " + times);
  }
}
