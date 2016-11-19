package es.codemotion.stream;

import java.util.function.Predicate;

class FilterStream<T> extends ReferenceStream<T, T>
{
  private Predicate<T> condition;

  protected FilterStream(AbstractStream<?, T> previous, Predicate<T> condition)
  {
    super(previous);
    this.condition = condition;
  }

  @Override
  protected Sink<T> wrapSink(Sink<T> sink)
  {
    return new FilterSink<>(sink, condition);
  }
}
