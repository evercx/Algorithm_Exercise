
# https://leetcode.com/problems/map-sum-pairs/description/

class MapSum:

    map = {}

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.map = {}

    def insert(self, key, val):
        """
        :type key: strpytls

        :type val: int
        :rtype: void
        """

        self.map[key] = val


    def sum(self, prefix):
        """
        :type prefix: str
        :rtype: int
        """

        res = 0;

        for map_key,map_value in self.map.items():
            if map_key.find(prefix) == 0:
                res += map_value
        return res


obj = MapSum()
obj.insert("apple", 3)
obj.insert("app", 5)
r = obj.sum("ap")

print(r)
