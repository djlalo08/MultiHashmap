# MultiHashmap
Woke up one morning and with a random stroke of inspiration!
I quickly coded up a Java implementation before I could forget the idea:

It's a bi-directional hashmap. That is rather than key-value pairs, we have col1-col2 pairs. We can query by col-1 and find it's corresponding col-2 item, or we can query by col-2 and find its corresponding col-1 item. Maintains same big-O as hashmap (i.e. everything other than hashing or increasing map size is constant-time), but slightly more steps (putting value-pair into map involves 3 hashmap inserts, retrieving an item by key requires 2-hashmap gets).

It is trivial to extend this to an n-col table. Each column added would cost an additional map insert when putting (i.e. putting a 4-tuple in a 4-map would involve 4+1* = 5 hashmap inserts)

*This corresponds to 1 insert for each column and another for the "indexMap"
