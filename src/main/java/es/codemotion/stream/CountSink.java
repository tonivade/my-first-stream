package es.codemotion.stream;

class CountSink<T> implements TerminalSink<T, Integer>
{
  private int counter;

  @Override
  public void accept(T t)
  {
    counter++;
  }

  @Override
  public Integer getResult()
  {
    return counter;
  }
}
