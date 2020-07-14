public int[] withoutTen(int[] nums) {
int[] tab = new int[nums.length];
int counter = 0;
for (int i = 0; i < nums.length; i++)
{
if (nums[i] != 10)
tab[counter++] = nums[i];
}
return tab;
}
