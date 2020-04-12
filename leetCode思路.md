[toc]

#leetCode各个题目思路
## 007整数反转
>题目描述
>给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

题目注意问题：
数据越界：如果32位的数据反转之后超过Integer.MAX_VALUE，那么需要返回0.
判断方法：用Integer.parseInt()函数抛出异常来判断反转后的字符串所构成的数字越界。

## 042接雨水
1. 首先，找到能存水的左边界索引left和右边界索引right。
>对于左边界索引left是从数组头到数组尾方向看，第一次出现下降趋势的那个索引的位置。
>对于右边界索引right是从数组尾到数组头方向看，第一次出现下降趋势的那个索引的位置。

2. 记录左边界和右边界的高度，分别记作leftHeight和rightHeight。显然，雨水数是由较低的边界所决定的。
>如果leftHeight小于等于rightHeight
>
>如果此时满足left < right，说明左右边界还没有重合，尝试着令left加1。如果left位置能够存储雨水，则更新结果的值。如果left位置不能存储雨水，说明left位置的高度大于等于leftHeight，这时我们应该进入下一轮循环，更新leftHeight的值。
>如果leftHeight大于rightHeight
>
>如果此时满足left < right，说明左右边界还没有重合，尝试着令right减1。如果right位置能够存储雨水，则更新结果的值。如果right位置不能存储雨水，说明right位置的高度大于等于rightHeight，这时我们应该进入下一轮循环，更新rightHeight的值。

3. 算法复杂度
时间复杂度是O(n)级别的，空间复杂度是O(1)级别的