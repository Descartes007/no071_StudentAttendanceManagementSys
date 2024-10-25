const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot84y43/",
            name: "springboot84y43",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "学生考勤管理系统"
        } 
    }
}
export default base
