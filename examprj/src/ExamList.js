import React, { useEffect, useState } from 'react';
import { Outlet, Link } from 'react-router-dom';

function ExamList(props) {
    const [data, setData] = useState([]);

    useEffect(() => {
        fetchList();
    }, [])

    const fetchList = () =>{
        fetch('http://192.168.0.67:8080/exam/list',
            {
                method: 'GET',
                headers: {
                    'Accept' : 'application/json'
                }
            }
        )
        .then(answer => answer.json())
        .then(data => setData(data))
        .catch(err => console.log('err: '+err.message))
    }

    return (
        <div>
            <h1>시험 목록</h1>
            <table border="">
                <tr>
                    <td>ID</td>
                    <td>학기</td>
                    <td>시험</td>
                    <td>학생ID</td>
                    <td>시험일</td>
                    <td>국어</td>
                    <td>영어</td>
                    <td>수학</td>
                    <td>파일</td>
                </tr>
                {data.map((vv, kk) => (
                    <tr key={kk}>
                        <td><Link to={`/exam/detail/${vv.id}`}>{vv.id}</Link></td>
                        <td>{vv.hakgi}</td>
                        <td>{vv.name}</td>
                        <td>{vv.pid}</td>
                        <td>{vv.regDate}</td>
                        <td>{vv.kor}</td>
                        <td>{vv.eng}</td>
                        <td>{vv.mat}</td>
                        <td>{vv.ff}</td>
                    </tr>
                ))}
            </table>
            <Outlet />
        </div>
    );
}

export default ExamList;