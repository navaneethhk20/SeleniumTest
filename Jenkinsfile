pipeline 
{
    agent any

    stages 
        {
        stage('Build') 
            {
            steps  
             {
                echo 'Build done'
             }
            }
        
    stage('test')
            {
            steps 
               {
                echo 'in progress'
               }
             }

        stage('deploy') 
                 {
            steps 
                {
                git credentialsId: '38dacc97-545d-45ec-bd25-999bb79def0a', url: 'https://github.com/navaneethhk20/SeleniumTest.git'
               }
             }
        } 
    
 }      
