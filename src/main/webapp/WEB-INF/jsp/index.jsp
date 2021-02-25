<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Interview</h1>  
       <form:form method="post" action="saveInterviewInfo">    
        <table >    
         <tr>    
          <td>interviewId : </td>   
          <td><form:input path="interviewId"  /></td>  
         </tr>    
         <tr>    
          <td>companyName :</td>    
          <td><form:input path="companyName" /></td>  
         </tr>   
         <tr>    
          <td>failureReason :</td>    
          <td><form:input path="failureReason" /></td>  
         </tr> 
          <tr>    
          <td>Answer :</td>    
          <td><form:input path="answer" /></td>  
         </tr>
          <tr>    
          <td>InterviewDate :</td>    
          <td><form:input path="interviewDate" /></td>  
         </tr> 
          <tr>    
          <td>InterviewQuestion :</td>    
          <td><form:input path="interviewQuestion" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save/update" /></td>
          <a href="getAllinterviews">All Interviews</a>  
              
         </tr>    
        </table>    
       </form:form>    