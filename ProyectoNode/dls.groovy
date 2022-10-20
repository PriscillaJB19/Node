pipelineJob('Prueba_Node'){
  definition{
    cpsScm{
      scm{
        git{
          remote{
          url('https://github.com/PriscillaJB19/Node.git')
          }
          branch ('*/master')
        }
      }
      
      lightweight()
      scriptPath('ProyectoNode/Jenkinsfile')
    }
  }
}
