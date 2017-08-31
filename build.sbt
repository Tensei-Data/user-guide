// Determine the project version via the "git describe" strategy (recommended).
git.useGitDescribe := true

lazy val commonSettings = Seq(
  organization := "com.wegtam.tensei"
)

// Tensei-User-Guide
lazy val userGuide = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "user-guide"
  )
  .enablePlugins(AsciidoctorPlugin, GitBranchPrompt, GitVersioning)

