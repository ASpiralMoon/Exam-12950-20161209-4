package exam;

import java.util.*;

/**
 * Created by ASpiralMoon on 2016/12/9.
 */
public class Exam4 {


        public static void main(String[] args) {
            Random r=new Random(System.currentTimeMillis());
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<50;i++){
                list.add(r.nextInt(100));
            }
            HashMap<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
            for(int i=0;i<10;i++){
                map.put(i, new ArrayList<Integer>());
            }
            for(int temp:list){
                int key=temp/10;
                List<Integer> thisList = map.get(key);
                thisList.add(temp);
            }

            //输出随机数
            System.out.print("随机生成50个小于100的数，分别是：");
            for(int i:list){
                System.out.print(i+" ");
            }
            //换行输出未排序的map
            System.out.println();
            System.out.print("Map中的数据为：");
            for(int i=0;i<10;i++){
                System.out.print(i+"==>"+map.get(i));
            }
            //map排序
            for(int i=0;i<10;i++){
                List<Integer> thisList = map.get(i);
                Collections.sort(thisList);
                map.put(i, thisList);
            }

            //换行输出排序后的map
            System.out.println();
            System.out.print("排序后的Map为：");
            for(int i=0;i<10;i++){
                System.out.print(i+"==>"+map.get(i));
            }

        }

    }
