# Hashing

- PreStore and fetch i.e. store in some sort of data structure 
    using which when you will try to fetch it gives the result in 0(1) time.

- Using arrays for hashing purpose uses lots of extra space and if the spaces exceeds after 10^7 if declared inside main method and 10^9 if declared globally than the program gives the "Segmentation Fault" error.
- To overcome this we need something called as Collection in Java which uses concept of hashing i.e. the Map.

# Map
- T(c) -> O(1)[Best and Average Case] for insertion and fetching as it uses tree
- Has Key and Value pair. Map<K, V>
- It just stores the required keys.
- If you query the key which is not present in the Map it will give null.
- Does not maintain the insertion order for HashMap in java.
- If you need order of insertion preserved you need to use LinkedHashMap in java.
- If you need natural ordering of its keys, or by a Comparator provided at map creation time use TreeMap in java.
- 