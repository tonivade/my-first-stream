package es.codemotion.stream;

import java.util.LinkedList;
import java.util.List;

public class ToArraySink<T> implements TerminalSink<T, Object[]>
{
  private List<T> result = new LinkedList<>();

  @Override
  public void accept(T t)
  {
    result.add(t);
  }

  @Override
  public Object[] getResult()
  {
    return result.toArray();
  }
}
