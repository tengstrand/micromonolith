(ns test-data-generator.core)

(defn new-id-counter []
  (atom 0))

(defn next-id [id]
  (swap! id inc)
  @id)

(defn new-address [id]
  {:address/id (next-id id)
   :address/street-number @id
   :address/street-name (str "Street" @id)
   :address/zipcode "12345"
   :address/city "Stockholm"})

(defn new-user [id address]
  {:user/id (next-id id)
   :user/given-name (str "Carl" @id)
   :user/surname (str "Andersson" @id)
   :user/address-id (:address/id address)})

(defn address-sql [{:keys [address/id
                           address/street-number
                           address/street-name
                           address/zipcode
                           address/city]}]
  (format "insert into address (id, street_number, street_name, zipcode, city) values (%d, %d, '%s', '%s', '%s')"
          id street-number street-name zipcode city))

(defn user-sql [{:keys [user/id
                        user/given-name
                        user/surname
                        user/address-id]}]
  (format "insert into user (id, given_name, surname, address_id) values (%d, '%s', '%s', %d)"
          id given-name surname address-id))

(defn- entity->sql [entity]
  (let [table-name (-> entity ffirst keyword namespace keyword)]
     (table-name {:address (address-sql entity)
                  :user (user-sql entity)})))

(defn persist [& entities]
  (let [sql-statements (map entity->sql entities)]
    ;; ...persist!
    sql-statements))
