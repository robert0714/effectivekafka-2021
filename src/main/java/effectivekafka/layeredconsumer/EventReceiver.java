package effectivekafka.layeredconsumer;

import java.io.*;

public interface EventReceiver extends Closeable {
  void addListener(EventListener listener);
  
  @Override
  void close();
}