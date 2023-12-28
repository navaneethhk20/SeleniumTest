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
                echo 'completed'
               }
             }
        } 
       post
        {
         always
         {
         emailext body: 'Check results', subject: 'Pipeline results', to: 'hknavaneeth@gmail.com' 
         }
       } 
 }      
