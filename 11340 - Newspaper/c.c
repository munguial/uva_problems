/* UVa 11340 - Newspaper */

#include <stdio.h>

unsigned int A[300];

int
main ()
{
	int cases, c, x;
	unsigned char z;
	unsigned long varo;
	scanf("%d", &cases);
	while (cases--)
	{
		for (x=0; x<300; ++x)
			A[x] = 0;
		varo = 0;
		scanf("%d\n", &c);
		while (c--)
		{
			z = getchar();
			scanf("%u\n", &x);
			A[z] = x;
		}

		scanf("%d\n", &c);
		while (c--)
			while ( (z=getchar()) != '\n' )
				varo += A[z];
		printf("%.2lf$\n", ((double) varo)/100.0);
	}

	return 0;
}

