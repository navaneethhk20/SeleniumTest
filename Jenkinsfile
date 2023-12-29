pipeline 
{
    agent any

    stages 
        {
         stage('deploy') 
                 {
            steps 
                {
                git branch: 'main', credentialsId: '38dacc97-545d-45ec-bd25-999bb79def0a', url: 'https://github.com/navaneethhk20/SeleniumTest.git'
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
               }
             }
        } 
    
 }      
