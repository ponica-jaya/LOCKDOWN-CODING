# Python program to print negative Numbers in given range 
start=int(input('Enter The Starting Number: '))
end=int(input('Enter The End Number: '))
print('\n')
print('All The Negtive Numbers In Range',start ,'To',end,'Is : ')
for i in range(start,end):
	if i<0:
		print(i ,end=' ')
print('\n')

