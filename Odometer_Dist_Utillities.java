import java.lang.Math.*;

public static Int getSize(Int Reading)
{
  int size = 0;
  while(Reading!=0)
  {
    size++;
    Reading = Reading/10;
  }
  return size;
}

public static Int getNext(Int Reading)
{
  Int odometer_size = getSize(Reading);
  int t = Reading;
  while(!isValid(Reading))
  {
    Reading++;
    if(getSize(Reading)>odometer_size)
      Reading = Math.pow(10,odometer_size-1);
  }
  if(t != Reading)
    return Reading;
  else
    return -1;
}

public static Int getPrev(Int Reading)
{
  Int odometer_size = getSize(Reading);
  int i = Reading;
  while(!isValid(Reading))
  {
    Reading--;
    if(getSize(Reading)<odometer_size)
      Reading = Math.pow(10,odometer_size)-1;
  }
  if(i != Reading)
    return Reading;
  else
    return -1;
}

public static Int distance(Int R1, Int R2)
{
  Int dist = 0;

  while(R1 != R2)
  {
    dist ++;
    R1 = getNext(R1);
  }

  return dist;
}
