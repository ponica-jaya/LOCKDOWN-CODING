n=int(input('Enter The Size Of List:'))
print('Enter the List elements:')
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
print('Total Even Numbers in a List:',ec)
print('Total Odd Numbers in a List:',oc)
