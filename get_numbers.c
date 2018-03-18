void GetNumbers( int [] )
{
    int b[ 10 ];
    int number = 0;
     
    printf( "Please enter your list of ten numbers: " );
 
    for ( int i = 0 ; i < 10; i++ ) {
        scanf( "%d", &number );
        b[ i ] = number;
    }
 
    printf( "Your array has these values: " );
 
    for ( int i = 0 ; i < 10; i++ ) {
        printf( "%d ", b[ i ] );
    }
 
    printf( "\n" );
}