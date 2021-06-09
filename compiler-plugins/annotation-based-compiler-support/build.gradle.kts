// GENERATED build.gradle.kts
// GENERATED BY kotlin.compiler-plugins.annotation-based-compiler-support.iml
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
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.base-compiler-plugins-ide-support", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.maven", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-tooling", JpsDepScope.COMPILE)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-api") }) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources_en") }) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.COMPILE) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("util") }) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.COMPILE) // 'intellij.platform.projectModel' dependency
    jpsLikeJarDependency(intellijPluginDep("maven", forIde = true), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("maven-model", forIde = true), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(files(rootDir.resolve("kotlin-ide/intellij/community/plugins/maven/maven-server-api/lib/lucene-core-2.4.1.jar").canonicalPath), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:trove4j:1.0.20200330", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-impl") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("external-system-rt") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("forms_rt") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("stats") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:ap-validation:0.0.5", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("dom-openapi") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("dom-impl") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("idea") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("cglib:cglib-nodep:3.2.4", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-xml") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains:annotations-java5:20.1.0", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("junit:junit:4.12", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework-java") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.1", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-impl") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources_en") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-api") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("jps-model") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:log4j:1.2.17.1", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("idea_rt") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework.core") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("util") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-xml") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains:jetCheck:0.2.2", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:gradle-api:6.8", JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.slf4j:slf4j-log4j12:1.7.25", JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.teamcity:serviceMessages:2019.1.4", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy-ant:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.common' dependency
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        java.srcDir("src")
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