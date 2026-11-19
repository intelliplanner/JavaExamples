package company.deloit;

import java.util.*;

/** Purpose: Encapsulates deloit behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Deloit {
        
        public static void main(String s[]) {
        int[] warehouseIds = {1,4,5,2,3,7,8};
        int[] parentWarehouseIds = {0,3,3,1,1,5,7};
        int closeWId = 3;
        List<Integer> li = findEffetedWarehouses(warehouseIds, parentWarehouseIds, closeWId);
        System.out.println(li);
    }

    /** Purpose: Retrieves find effeted warehouses data. */
    public static List<Integer> findEffetedWarehouses(int[] warehouseIds, int[] parentWarehouseIds, int closeWId) {
        List<Integer> result = new ArrayList<>();//        {4,5,7,8}
        HashMap<Integer,List<Integer>> map= new HashMap<>();

        for (int i = 0; i < parentWarehouseIds.length ; i++) {
            int parentId = parentWarehouseIds[i];
            int childId = warehouseIds[i];
            map.computeIfAbsent(parentId,x->new ArrayList<>()).add(childId);

        }
        System.out.println(map);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(closeWId);

        while(!queue.isEmpty()){
            int currentValue = queue.poll();
            List<Integer> data = map.get(currentValue);
            if(data!=null){
            result.addAll(data);
            queue.addAll(data);
            }
        }

        return result;
    }

}
