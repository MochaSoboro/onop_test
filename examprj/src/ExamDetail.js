import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';

function ExamDetail(props) {

    const [data, setData] = useState([]);
    const {id} = useParams();
    useEffect(() => {
        fetchData();
    }, []);

    const fetchData = ()=>{
        fetch(`http://192.168.0.67:8080/exam/detail?id=${id}`,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json'
                }
            }
        )
        .then(answer => answer.json())
        .then(data => setData(data))
        .catch(err=>console.log('error: '+err.message))
    }

    return (
        <div>
            <h1>상세</h1>
            <table border="">
                <tr>
                    <td>ID</td>		<td>{data.id}</td>
                </tr>
                <tr>
                    <td>학기</td>		<td>{data.hakgi}</td>
                </tr><tr>
                    <td>시험</td>		<td>{data.name}</td>
                </tr><tr>
                    <td>학생ID</td>	    <td>{data.pid}</td>
                </tr><tr>
                    <td>시험일</td>	    <td>{data.regDate}</td>
                </tr><tr>
                    <td>국어</td>		<td>{data.kor}</td>
                </tr><tr>
                    <td>영어</td>		<td>{data.eng}</td>
                </tr><tr>
                    <td>수학</td>		<td>{data.mat}</td>
                </tr><tr>
                    <td>파일</td>		<td>{data.ff}</td>
                </tr>
                <tr>
                    <td colspan='2'><Link to='/exam'>목록으로</Link></td>
                </tr>
            </table>
        </div>
    );
}

export default ExamDetail;