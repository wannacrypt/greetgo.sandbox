///MODIFY replace sandbox {PROJECT_NAME}
package kz.greetgo.sandbox.register.test.util;

import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;
///MODIFY replace sandbox {PROJECT_NAME}
import kz.greetgo.sandbox.register.test.beans.develop.DbLoader;
///MODIFY replace sandbox {PROJECT_NAME}
import kz.greetgo.sandbox.register.test.beans.develop.DbWorker;

@Include(BeanConfigTests.class)
public interface TestsBeanContainer extends BeanContainer {
  DbWorker dbWorker();

  DbLoader dbLoader();
}
