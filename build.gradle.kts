plugins {
    id("java")
    id("com.bmuschko.docker-java-application") version "6.1.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework:spring-context:6.1.4")

}

val buildDir = layout.buildDirectory
tasks.register("createJar", Jar::class) {
    archiveBaseName.set("your-application-name")
    archiveVersion.set("1.0")
    from(sourceSets.main.get().output)
    manifest {
        attributes["Main-Class"] = "org.example.hw9.hw9" // Укажите основной класс вашего приложения
    }
    val outputDir = project.layout.projectDirectory.dir("./docker")
    destinationDirectory.set(outputDir)
}

tasks.named("build") {
    dependsOn("createJar")
}

tasks.register<Exec>("deploy") {
    workingDir = file("${projectDir}\\docker")
    commandLine = listOf("cmd","/C" , "${projectDir}\\docker\\deploy.bat")
}

tasks.named("deploy") {
    dependsOn("createJar")
}

tasks.named("build") {
    dependsOn("deploy")
}
