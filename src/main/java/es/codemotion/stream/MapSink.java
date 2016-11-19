package es.codemotion.stream;

import java.util.function.Function;

public class MapSink<T, R> implements Sink<T>
{
  private Function<T, R> mapper;
  private Sink<R> next;

  public MapSink(Sink<R> next, Function<T, R> mapper)
  {
    this.next = next;
    this.mapper = mapper;
  }

  @Override
  public void accept(T t)
  {
    next.accept(mapper.apply(t));
  }
}
