// GENERATED build.gradle.kts
// GENERATED BY kotlin.jvm-debugger.evaluation.iml
// USE `./gradlew generateIdeaGradleFiles` TO REGENERATE THIS FILE

plugins {
    kotlin("jvm")
    id("jps-compatible")
}

repositories {
    maven { setUrl("https://cache-redirector.jetbrains.com/maven-central") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/intellij-third-party-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/dekaf") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jcenter.bintray.com") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.google.com/dl/android/maven2") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.spring.io/milestone") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.jenkins-ci.org/releases") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/test-discovery") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/markdown") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.bintray.com/groovy/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-model-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/jediterm") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/intellij-terraform") }
    maven { setUrl("https://cache-redirector.jetbrains.com/download.jetbrains.com/teamcity-repository") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.maven.apache.org/maven2/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/clojars.org/repo") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/public/p/space/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/packages.jetbrains.team/maven/p/skija/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/intellij-plugin-service") }
    maven { setUrl("https://cache-redirector.jetbrains.com/intellij-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
}

dependencies {
    implementation(toolsJarApi())
    jpsLikeJarDependency(kotlinStdlib(), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-stdlib-jdk7"), JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.1", JpsDepScope.COMPILE, { isTransitive = false })
    jpsLikeJarDependency("com.google.guava:guava:30.1-jre", JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.old", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.util", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.eval4j", JpsDepScope.COMPILE)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-impl") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources_en") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-api") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("util") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("forms_rt") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("jps-model") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("testFramework") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("junit:junit:4.12", JpsDepScope.COMPILE) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:log4j:1.2.17.1", JpsDepScope.COMPILE) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("idea_rt") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.COMPILE) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("testFramework.core") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains:jetCheck:0.2.2", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.COMPILE) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.COMPILE) // 'intellij.java.psi.impl' dependency
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.coroutines", JpsDepScope.COMPILE)
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        java.srcDir("src")
        resources.srcDir("resources")
    }
    "test" {
        
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xskip-prerelease-check")
    kotlinOptions.jdkHome = rootProject.extra["JDK_11"] as String
    kotlinOptions.useOldBackend = true // KT-45697
}

// Fake empty configuration in order to make `DependencyHandler.projectTests(name: String)` work
configurations.getOrCreate("tests-jar")