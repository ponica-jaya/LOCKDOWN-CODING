#include <stdio.h>
int check_armstrong(int);
int power(int, int);

int main ()
{
  int c, a, b;

  printf("Input two integers\n");
  scanf("%d%d", &a, &b);

  for (c = a; c <= b; c++)
    if (check_armstrong(c) == 1)
      printf("%d\n", c);

  return 0;
}

int check_armstrong(int n) {
  long long sum = 0, t;
  int remainder, digits = 0;

  t = n;

  while (t != 0) {
    digits++;
    t = t/10;
  }

  t = n;

  while (t != 0) {
    remainder = t%10;
    sum = sum + power(remainder, digits);
    t = t/10;
  }

  if (n == sum)
    return 1;
  else
    return 0;
}

int power(int n, int r) {
  int c, p = 1;

  for (c = 1; c <= r; c++)
    p = p*n;

  return p;
}
