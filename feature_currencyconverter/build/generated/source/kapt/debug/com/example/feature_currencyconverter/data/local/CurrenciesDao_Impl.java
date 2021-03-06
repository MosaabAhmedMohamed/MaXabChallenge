package com.example.feature_currencyconverter.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.feature_currencyconverter.data.local.model.CurrencyEntity;
import com.example.feature_currencyconverter.data.local.model.converter.CurrencyRateEntityTypeConverter;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrenciesDao_Impl implements CurrenciesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrencyEntity> __insertionAdapterOfCurrencyEntity;

  private final CurrencyRateEntityTypeConverter __currencyRateEntityTypeConverter = new CurrencyRateEntityTypeConverter();

  public CurrenciesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrencyEntity = new EntityInsertionAdapter<CurrencyEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `currencies` (`id`,`timestamp`,`base`,`date`,`rates`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrencyEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTimestamp());
        if (value.getBase() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBase());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        final String _tmp = __currencyRateEntityTypeConverter.mapToString(value.getRates());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
  }

  @Override
  public Object insertCountries(final CurrencyEntity currency,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCurrencyEntity.insert(currency);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAll(final Continuation<? super CurrencyEntity> continuation) {
    final String _sql = "SELECT * FROM currencies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<CurrencyEntity>() {
      @Override
      public CurrencyEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfRates = CursorUtil.getColumnIndexOrThrow(_cursor, "rates");
          final CurrencyEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpBase;
            if (_cursor.isNull(_cursorIndexOfBase)) {
              _tmpBase = null;
            } else {
              _tmpBase = _cursor.getString(_cursorIndexOfBase);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final Map<String, Double> _tmpRates;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfRates)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfRates);
            }
            _tmpRates = __currencyRateEntityTypeConverter.stringToMap(_tmp);
            _result = new CurrencyEntity(_tmpId,_tmpTimestamp,_tmpBase,_tmpDate,_tmpRates);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
