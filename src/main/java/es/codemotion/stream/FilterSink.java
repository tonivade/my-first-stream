package es.codemotion.stream;

import java.util.function.Predicate;

class FilterSink<T> implements Sink<T>
{
  private Sink<T> next;
  private Predicate<T> condition;

  public FilterSink(Sink<T> next, Predicate<T> condition)
  {
    this.next = next;
    this.condition = condition;
  }

  @Override
  public void accept(T t)
  {
    if (condition.test(t))
    {
      next.accept(t);
    }
  }
}
