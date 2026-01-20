package CollectionFramwork.Map.realtimeQuestions;

import java.util.*;

class Processor {
    private int processorId;
    private String processorName;

    public Processor(int processorId, String processorName) {
        this.processorId = processorId;
        this.processorName = processorName;
    }

    public int getProcessorId() {
        return processorId;
    }

    public void setProcessorId(int processorId) {
        this.processorId = processorId;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processorId=" + processorId +
                ", processorName='" + processorName + '\'' +
                '}';
    }
}

public class SortEntry {

    public static void main(String[] args) {
        Processor p1 = new Processor(8650, "Snapdragon 8 Gen 3");
        Processor p2 = new Processor(6989, "Dimensity 9300");
        Processor p3 = new Processor(1650, "A17 Pro");
        Processor p4 = new Processor(5650, "Tensor G2");

        Map<Integer, String> map = new HashMap<>();
        map.put(p1.getProcessorId(), p1.getProcessorName());
        map.put(p2.getProcessorId(), p2.getProcessorName());
        map.put(p3.getProcessorId(), p3.getProcessorName());
        map.put(p4.getProcessorId(), p4.getProcessorName());

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });
        System.out.println(list);

    }
}
