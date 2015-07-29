package kms.techcon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerC {

    private static class Dependency {
        private String appName;
        private List<Map<String, Object>> deps;

        public Dependency() {
            deps = new ArrayList<>();
        }

        public List<Map<String, Object>> getDeps() {
            return deps;
        }

        public void setDeps(List<Map<String, Object>> deps) {
            this.deps = deps;
        }

        public void addDep(Map<String, Object> dep) {
            deps.add(dep);
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }
    }

    @RequestMapping("/dependencies")
    public Dependency getDependency() throws Exception {
        Dependency dependency = new Dependency();

        dependency.setAppName("Application C");

        return dependency;
    }

}
