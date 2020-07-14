Given a list of numbers, write a Python program to count Even and Odd numbers in a List. 

n=int(input('Enter The Size Of List: '))
print('Enter The List Elements: ')
a=[]
oc=0
ec=0
for i in range(0,n):
	a.append(int(input()))
for i in a:
	if i%2==0:
		 ec+=1
	else:
		oc+=1

print('Total Even Numbers In a List: ',ec)
print('Total Odd Numbers In a List: ',oc)


