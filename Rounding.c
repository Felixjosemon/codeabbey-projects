#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    // open file in read only mode
    
    int num_pairs;
    scanf("%d", &num_pairs);

    // create array to hold pairs
    int pairsArray[1000],answersArray[1000];
   

    // read each line, add the pairs to our pairsArray
    int ii;

    for (ii = 0; ii < (num_pairs * 2); ii = ii + 2)
    {
        scanf( "%d %d", &pairsArray[ii], &pairsArray[ii + 1]);
    }

    // create array to hold answers
   

    // find the answers and hold them in the array 
    int jj = 0;
    int kk = 0;

    for (jj = 0, kk= 0; jj < (num_pairs * 2); jj = jj + 2, kk++)
    {
        float abs_div = fabsf( (float) pairsArray[jj] / pairsArray[jj + 1]);
        int int_div = abs( pairsArray[jj] / pairsArray[jj + 1] );

        if ( (pairsArray[jj] / pairsArray[jj + 1]) > 0 )
        {
            if ( (abs_div - int_div) >= 0.5 ) 
            {
                answersArray[kk] = (pairsArray[jj] / pairsArray[jj + 1]) + 1;
            }
            else
            {
                answersArray[kk] = pairsArray[jj] / pairsArray[jj + 1];
            }
        }
        else
        {
            if ( (abs_div - int_div) >= 0.5 )
            {
                answersArray[kk] = (int_div + 1) * -1;
            }
            else
            {
                answersArray[kk] = int_div * -1;
            }
        }
    }

    // print answers
    int ll = 0;
    
    for (ll = 0; ll < num_pairs; ll++)
    {
        if (ll == (num_pairs - 1))
        {
            printf("%d\n", answersArray[ll]);
        }
        else
        {
            printf("%d ", answersArray[ll]);
        }
    }

    return 0;
}
