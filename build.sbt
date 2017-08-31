// Determine the project version via the "git describe" strategy (recommended).
git.useGitDescribe := true

lazy val commonSettings = Seq(
  organization := "com.wegtam.tensei"
)

// The main project that simply aggregates all components.
//lazy val tenseiDocs = project.in(file("."))
//  .settings(commonSettings: _*)
//  .settings(
//    name := "tensei-docs"
//  )
//  .enablePlugins(GitBranchPrompt, GitVersioning)
//  .aggregate(cookbook, demoGuide, handbook, userGuide)

// Tensei-User-Guide
lazy val userGuide = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "user-guide"
  )
  .enablePlugins(AsciidoctorPlugin, GitBranchPrompt, GitVersioning)

