import { Routes, Route, BrowserRouter } from 'react-router-dom';
import ExamList from './ExamList';
import ExamDetail from './ExamDetail';

function ExamMain(props) {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path='/exam' element={<ExamList />} />
                    <Route path='/exam/detail/:id' element={<ExamDetail />} />
                </Routes>
            </BrowserRouter>

        </>
    );
}

export default ExamMain;