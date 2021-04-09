public class merge_array {

	public static void main(String[] args) {
	int a[]= {10,30,40};
	int b[]= {20,50,60,70,80};
int c[]=new int[a.length+b.length];

int i=0,k=0,j=0;

while(i<a.length && j<b.length){
	if(a[i]<b[j]){
		c[k]=a[i];
		i++;
		k++;
	}
	else{
		c[k]=b[j];
		j++;
		k++;
	}
}
while(i<a.length){
	c[k]=a[i];
		i++;
		k++;
}
while(j<b.length){
	c[k]=b[j];
	j++;
	k++;
}


for(int ch : c) {
	System.out.print(ch+" ");
}

	}

}
   
